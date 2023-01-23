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

//get data

app.get('/Login/:userName',(req,res)=>{
    let usernam=req.params.userName;
    let qr="select MOT_DE_PASS , LIBELLE_ROLE from UTILISATEUR U, ROLE R where U.CODE_ROLE = R.CODE_ROLE AND U.NOM_UTILISATEUR ='"+usernam+"'";

    db.query(qr,(err,result)=>{
        if(err){
            console.log('errer in querry ... ',err);
        }

        if(result.length>0)
        {
            res.send({
                message:'all data',
                data:result
            });
        }else{
            res.send({
                message:'data not found'
            });
        }

    });
});


app.listen(8087,()=>{
    console.log('server runnig ..');
});
