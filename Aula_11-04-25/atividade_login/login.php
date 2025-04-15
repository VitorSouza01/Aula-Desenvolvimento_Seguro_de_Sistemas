<?php
session_start();

$host = 'localhost';
$dbname = 'login_db';
$username = 'root';
$password = 'root'; // substitua pela sua senha do MySQL, se houver

// Conectar ao banco de dados MySQL
$conn = new mysqli($host, $username, $password, $dbname);

// Verifique se há erros de conexão
if ($conn->connect_error) {
    die("Falha na conexão: " . $conn->connect_error);
}

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $usuario = $_POST['usuario'];
    $senha = ($_POST['senha']); // Criptgrafando a senha para comparar com o banco

    // Verifique se o usuário existe no banco de dados
    $sql = "SELECT * FROM usuario WHERE usuario = ? AND senha = ?";
    $stmt = $conn->prepare($sql);
    $stmt->bind_param("ss", $usuario, $senha);
    $stmt->execute();
    $result = $stmt->get_result();

    if($result->num_rows > 0) {
        // Login bem-sucedido, redirecionar para a página Home
        $_SESSION['usuario'] = $usuario;
        header("Location: home.php");
        exit;
    } else {
        // Login falhou, redirecionar com erro
        header("Location: login.html?erro=Usuário não cadastrado");
        exit;
    }
}

$conn->close();
?>
