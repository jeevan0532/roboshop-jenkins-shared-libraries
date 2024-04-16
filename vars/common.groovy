def compile() {
 if (app_lang == "nodejs"){
    sh 'npm install'
 }
 if (app_lang == "java/maven"){
    sh 'mvn package'
    }
}

def test() {
 if (app_lang == "nodejs"){
    try{
      sh 'npm test'
    }
    catch(eception failed) {
      email ("unit test failed")
    }
 }
 if (app_lang == "maven"){
    sh 'mvn test'
 }
}

def email(email_note){
 println email_note
}
