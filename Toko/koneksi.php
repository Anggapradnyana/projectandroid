<?php
$server="localhost";
$username="id13879381_root";
$password="2>E&bI*LU&}*qYJU";
$dbname="id13879381_toko";

$conn = new mysqli($server,$username,$password,$dbname);

if ($conn->connect_error) {
	die("koneksi gagal/failed ".$conn->connect_error);
}
$sql="SELECT * FROM t_menu";
$result=$conn->query($sql);
$data=array();

if ($result->num_rows>0) {
	while ($row=$result->fetch_assoc()) {
		$data[]=$row;
	}
	}else{
		echo "data kosong";
	}
	echo json_encode($data);
	$conn->close();
?>