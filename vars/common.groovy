def compile() {
 if (app_lang == "nodejs"){
    sh 'npm install'
    sh 'env'
 }
 if (app_lang == "java/maven"){
    sh 'mvn package'
 }
}

def unittest() {
 if (app_lang == "nodejs"){
     sh 'npm test'
 }
 if (app_lang == "java/maven"){
    sh 'mvn test'
 }
 if (app_lang == "python"){
    sh 'pyhton3 -m unittest'
 }
}

def email(email_note){
    mail bcc: '', body: "job failed-${JOB_BASE_NAME}\njob-url-${JOB_URL}", cc: '', from: 'jeev55534u@gmail.com', replyTo: '', subject: 'test', to: 'jeev55534u@gmail.com'
}
