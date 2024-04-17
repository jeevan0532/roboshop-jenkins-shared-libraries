def compile() {
 if (app_lang == "nodejs"){
    sh 'npm install'
 }
 if (app_lang == "java/maven"){
    sh 'mvn package'
    }
}

def unittest() {
 if (app_lang == "nodejs"){
    try {
      sh 'npm test'
    }catch(Exception e){
      email("unit test failed")
    }
 }
 if (app_lang == "java/maven"){
    sh 'mvn test'
 }
 if (app_lang == "python"){
    sh 'pyhton3 -m unittest'
 }
}

def email(email_note){
 println "(email_note)"
}
