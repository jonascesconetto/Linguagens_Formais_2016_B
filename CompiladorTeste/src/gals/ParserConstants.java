package gals;

public interface ParserConstants
{
    int FIRST_SEMANTIC_ACTION = 14;

    int SHIFT  = 0;
    int REDUCE = 1;
    int ACTION = 2;
    int ACCEPT = 3;
    int GO_TO  = 4;
    int ERROR  = 5;

    int[][][] PARSER_TABLE =
    {
        { {ERROR ,  0}, {SHIFT ,  7}, {SHIFT ,  8}, {ERROR ,  0}, {SHIFT ,  4}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT ,  6}, {ERROR ,  0}, {GO_TO ,  1}, {GO_TO ,  2}, {GO_TO ,  3}, {GO_TO ,  5}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ACCEPT,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT ,  9}, {SHIFT , 10}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {REDUCE,  2}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  2}, {REDUCE,  2}, {SHIFT , 11}, {SHIFT , 12}, {ERROR ,  0}, {REDUCE,  2}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {REDUCE,  5}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  5}, {REDUCE,  5}, {REDUCE,  5}, {REDUCE,  5}, {ERROR ,  0}, {REDUCE,  5}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {SHIFT ,  7}, {SHIFT ,  8}, {ERROR ,  0}, {SHIFT ,  4}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT ,  6}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 13}, {GO_TO ,  5}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {REDUCE,  7}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  7}, {REDUCE,  7}, {REDUCE,  7}, {REDUCE,  7}, {ERROR ,  0}, {REDUCE,  7}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {SHIFT ,  7}, {SHIFT ,  8}, {ERROR ,  0}, {SHIFT ,  4}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT ,  6}, {ERROR ,  0}, {GO_TO , 14}, {GO_TO ,  2}, {GO_TO ,  3}, {GO_TO ,  5}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ACTION,  3}, {ERROR ,  0}, {ERROR ,  0}, {ACTION,  3}, {ACTION,  3}, {ACTION,  3}, {ACTION,  3}, {ERROR ,  0}, {ACTION,  3}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 15}, {ERROR ,  0} },
        { {REDUCE, 10}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE, 10}, {REDUCE, 10}, {REDUCE, 10}, {REDUCE, 10}, {ERROR ,  0}, {REDUCE, 10}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {SHIFT ,  7}, {SHIFT ,  8}, {ERROR ,  0}, {SHIFT ,  4}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT ,  6}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 16}, {GO_TO ,  3}, {GO_TO ,  5}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {SHIFT ,  7}, {SHIFT ,  8}, {ERROR ,  0}, {SHIFT ,  4}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT ,  6}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 17}, {GO_TO ,  3}, {GO_TO ,  5}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {SHIFT ,  7}, {SHIFT ,  8}, {ERROR ,  0}, {SHIFT ,  4}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT ,  6}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 18}, {GO_TO ,  5}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {SHIFT ,  7}, {SHIFT ,  8}, {ERROR ,  0}, {SHIFT ,  4}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT ,  6}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 19}, {GO_TO ,  5}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {REDUCE,  6}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  6}, {REDUCE,  6}, {REDUCE,  6}, {REDUCE,  6}, {ERROR ,  0}, {REDUCE,  6}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT ,  9}, {SHIFT , 10}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 20}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {REDUCE,  9}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  9}, {REDUCE,  9}, {REDUCE,  9}, {REDUCE,  9}, {ERROR ,  0}, {REDUCE,  9}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ACTION,  1}, {ERROR ,  0}, {ERROR ,  0}, {ACTION,  1}, {ACTION,  1}, {SHIFT , 11}, {SHIFT , 12}, {ERROR ,  0}, {ACTION,  1}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 21}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {REDUCE,  1}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  1}, {REDUCE,  1}, {SHIFT , 11}, {SHIFT , 12}, {ERROR ,  0}, {REDUCE,  1}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ACTION,  2}, {ERROR ,  0}, {ERROR ,  0}, {ACTION,  2}, {ACTION,  2}, {ACTION,  2}, {ACTION,  2}, {ERROR ,  0}, {ACTION,  2}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 22}, {ERROR ,  0}, {ERROR ,  0} },
        { {REDUCE,  4}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  4}, {REDUCE,  4}, {REDUCE,  4}, {REDUCE,  4}, {ERROR ,  0}, {REDUCE,  4}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {REDUCE,  8}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  8}, {REDUCE,  8}, {REDUCE,  8}, {REDUCE,  8}, {ERROR ,  0}, {REDUCE,  8}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {REDUCE,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  0}, {REDUCE,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {REDUCE,  3}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  3}, {REDUCE,  3}, {REDUCE,  3}, {REDUCE,  3}, {ERROR ,  0}, {REDUCE,  3}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} }
    };

    int[][] PRODUCTIONS =
    {
        { 10, 4 },
        { 10, 3 },
        { 10, 1 },
        { 11, 4 },
        { 11, 3 },
        { 11, 1 },
        { 12, 2 },
        { 12, 1 },
        { 13, 3 },
        { 13, 2 },
        { 13, 1 }
    };

    String[] PARSER_ERROR =
    {
        "Erro estado 0",
        "Erro estado 1",
        "Erro estado 2",
        "Erro estado 3",
        "Erro estado 4",
        "Erro estado 5",
        "Erro estado 6",
        "Erro estado 7",
        "Erro estado 8",
        "Erro estado 9",
        "Erro estado 10",
        "Erro estado 11",
        "Erro estado 12",
        "Erro estado 13",
        "Erro estado 14",
        "Erro estado 15",
        "Erro estado 16",
        "Erro estado 17",
        "Erro estado 18",
        "Erro estado 19",
        "Erro estado 20",
        "Erro estado 21",
        "Erro estado 22"
    };
}
