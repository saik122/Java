<?php
$firstname = $_POST['firstname'];
$middlename = $_POST['middlename'];
$lastname = $_POST['lastname'];
$Course = $_POST['Course'];
$Gender = $_POST['Gender'];
$phone = $_POST['phone'];
$address = $_POST['address'];
$email = $_POST['email'];
$Password = $_POST['Password'];
$repass = $_POST['repass'];

$conn = new mysqli('localhost','root','','regiform');
if($conn->connect_error)
{
    die('Connection Failed : '.$conn->connect_error);
    }
    else{
        $stmt =$conn->prepare("insert into registration(firstname,middlename,lastname,Course,Gender,phone,address,email,Password,repass)value(?,?,?,?,?,?,?,?,?,?)");
        $stmt->bind_param("sssssiisss"$firstname, $middlename, $lastname, $Course, $Gender, $phone, $address, $email, $Password, $repass);
        $stmt->execute();
        echo "registration sucessfully....";
        $stmt->close();
        $conn->close();
    }
    ?>