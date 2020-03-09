package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
        board = new String[3][3];
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] a = new String[3];
        for (int i = 0; i <a.length; i++) {
            a[i] = board[i][value];
        }
        return a;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] a = getRow(rowIndex);
        for (int i = 1; i < a.length ; i++) {
            if(!a[0].equals(a[i]))
                return false;
        }
        return true;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] a = getColumn(columnIndex);
        for (int i = 1; i < a.length ; i++) {
            if(!a[0].equals(a[i]))
                return false;
        }
        return true;
    }

    public boolean isRDiagonalHomo(){
        int counter = 0;
        int j = board.length-1;
        String who = board[0][2];
        for (String[] strings : board) {
            if (strings[j].equals(who)) {
                counter++;
            }
            j--;
        }
        return counter==board.length;
    }

    public boolean isLDiagonalHomo(){
        int counter = 0;
        String who = board[0][0];
        for(int i=0; i<board.length; i++){
            if(board[i][i].equals(who)){
                counter++;
            }
        }
        return counter==board.length;
    }

    public String getWinner() {
        for (int i = 0; i < 3 ; i++) {
            if(isRowHomogenous(i) || isColumnHomogeneous(i)){
                if(isRowHomogenous(i))
                    return getRow(i)[0];
                else if(isColumnHomogeneous(i))
                    return getColumn(i)[0];
            }
        }

        if(isRDiagonalHomo() || isLDiagonalHomo()){
            if(isRDiagonalHomo())
                return board[0][2];
            else if(isLDiagonalHomo())
                return board[0][0];
        }
        return null;
    }

    public String[][] getBoard() {
        return board;
    }
}
