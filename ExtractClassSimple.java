class Foo{
    int x, y;
    int z;
    
    void goo(){
        x++;
        y++;
    }

    void foo(){
        z++;
        goo();
    }
}


class RefactoredFoo{
    Other other;
    int z;
    
    void foo(){
        z++;
        other.goo();
    }
}

class Other{
    int x, y;

    void goo(){
        x++;
        y++;
    }
}

