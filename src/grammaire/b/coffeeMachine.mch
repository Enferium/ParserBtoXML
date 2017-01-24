MACHINE
    CoffeeMachine
VARIABLES
    Mago, Balance, CoffeeLeft, Statut

INVARIANT
    Mago >= 0

INITIALISATION
    Statut := 0 ||
    Mago := 0 ||
    Balance := 0 ||
    CoffeeLeft := 100

OPERATIONS

    insert100 =
        SELECT
            Statut = 1
        THEN
            Balance := Balance
        END;

    insert200 =
        SELECT
            Statut = 1
        THEN
            Balance := Balance
        END;

    insert10 =
        SELECT
            Statut = 1
        THEN
            Balance := Balance
        END;

    insert20 =
        SELECT
            Statut = 1
        THEN
            Balance := Balance
        END;

    insert50 =
        SELECT
            Statut = 1
        THEN
            Balance := Balance
        END;

    powerUp =
        SELECT
            Statut = 0
        THEN
            Statut := 1
        END;

    powerDown =
        SELECT
            (not (Statut = 0))
        THEN
            Statut := 0
        END;

     autoOut =
        SELECT
            (CoffeeLeft = 0) 
        THEN
            Statut := 2 ||
            Balance := 0
        END;

    takeMago =
        SELECT
            Statut = 0
        THEN
            Mago := 0
        END;
    
    addCoffee =
        ANY
            x
        WHERE
            x > 0
        THEN
            SELECT
                Statut = 0
            THEN
                CoffeeLeft := CoffeeLeft
            END
        END;

    serveCoffee =
        SELECT
            Statut = 1
        THEN
            CoffeeLeft := CoffeeLeft ||
            Mago := Mago
        END;

    backBalance =
        SELECT
            Statut = 1
        THEN
            Balance := 0
        END
END