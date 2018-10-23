class Rot {
    static rotateChar(ch, n) {
        const ord = ch.charCodeAt(0);
        const letters = 26;
        
        if (ord >= 65 && ord <= 90)
            var offset = 65;
        else if (ord >= 97 && ord <= 122)
            offset = 97;
        else
            return ch;

        const r =  (((ord - offset) + (n % letters)) % letters) + offset;
        return String.fromCharCode(r);
    }

    static encode(str, n){
        return str.split('').map(c => Rot.rotateChar(c, n)).join('');
    }
}

module.exports = Rot;
