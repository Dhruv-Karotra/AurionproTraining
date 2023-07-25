let board = Array(9);
let isGameEnds = false;
let player1Turn = true;
let storeValue = 'X';
// console.log(board);
function playerWon(board) {

        if((board[0] == board[1] && board[1] == board[2] && board[0]!=undefined) || (board[0] == board[3] && board[3] == board[6] && board[0]!=undefined) || (board[0] == board[4] && board[4] == board[8] && board[0]!=undefined)) {
            return board[0];
        }
        if((board[3] == board[4] && board[4] == board[5] && board[3]!=undefined) ||(board[1] == board[4] && board[4] == board[7] && board[1]!=undefined) || (board[2] == board[4] && board[4] == board[6] && board[2]!=undefined)){
            return board[4];
        }
        if((board[6] == board[7] && board[7] == board[8] && board[6]!=undefined) || (board[2] == board[5] && board[5] == board[8] && board[2]!=undefined)){
            return board[8];
        }
    
}

function boardIsFull(board) {
    for (let i = 0; i < board.length; i++) {
        if (board[i] == undefined) {
            return false;
        }
    }
    return true;
}

function showBoard(board) {
    return board;
}

function play() {
    const player1Input = prompt('Enter player1 name');
    // const player1 = parseInt(player1Input);

    const player2Input = prompt('Enter player2 name');
    // const player2 = parseInt(player2Input);

    while (!isGameEnds) {
        console.log(showBoard(board))
        if (player1Turn) {
            console.log(player1Input, "'s Turn (X):");
        } else {
            console.log(player2Input + "'s Turn (O):");
        }
        if (player1Turn) {
            storeValue = 'X';
        } else {
            storeValue = 'O';
        }
        let index = 0;
        while (true) {
            const userInput = prompt('Enter cell index (0-8)');
            index = parseInt(userInput);
            if (isNaN(userInput) || index < 0 || index > 8) {
                console.log("Invalid input");
            }
            else if (board[index] != undefined) {
                console.log("Position already taken");
            }
            else {
                break;
            }
        }
        board[index] = storeValue;
        console.log(board[index])
        // console.log(playerWon(board)," :playerWon(board)");
        if (playerWon(board) == 'X') {
            console.log(player1Input, " has won!");
            isGameEnds = true;
        } else if (playerWon(board) == 'O') {
            console.log(player2Input, " has won!");
            isGameEnds = true;
        } else {
            if (boardIsFull(board)) {
                console.log("It's a tie!");
                isGameEnds = true;
            } else {
                //the players alternate each turn
                player1Turn = !player1Turn;
            }
        }

        console.log(showBoard(board));
    }
}