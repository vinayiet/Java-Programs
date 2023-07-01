if (y == 0) {
            return x;
        }

        return find(y, x % y);