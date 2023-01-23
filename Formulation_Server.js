const express =require('express');
const bodyparser =require('body-parser');
const cors =require('cors');
const mysql=require('mysql2')


const app=express();
app.use(cors());
app.use(bodyparser.json());




//database connection
const db=mysql.createConnection({
    host:'localhost',
    user:'U_ADMINISTRATEUR',
    password:'1234',
    database:'brac_users',
    port:3308

});

//check the connection
db.connect((err)=>{
    if(err){
        console.log(err,'erreur while establishing connection...');
    }else{
        console.log('connect successfuly ...');
    }
});