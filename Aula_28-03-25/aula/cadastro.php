<?php
include 'db.php';
// Recebe os dados do formulário
$nome = $_POST['nome'];
$email = $_POST['email'];
$telefone = $_POST['telefone'];
$senha = $_POST['senha'];

// Insere os dados na tabela
$sql = "INSERT INTO usuario (nome, email, telefone, senha)
VALUES ('$nome', '$email', '$telefone', '$senha')";

if ($conn->query($sql) === TRUE) {
    echo "Usuario Criado com sucesso!";
        header("Location: index.html");
} else {
    echo "Erro ao cadastrar o usuario: " . $conn->error;
}

$conn->close();
?>
