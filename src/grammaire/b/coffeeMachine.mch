MACHINE
    CoffeeMachine
VARIABLES
    Mago, Balance, CoffeeLeft, Statut

INVARIANT
    Mago >= 0

OPERATIONS

    insert100 =
        SELECT
            Statut = 1
        THEN
            Balance := Balance
        END

END