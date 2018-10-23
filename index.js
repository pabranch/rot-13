const Rot = require('./src/rot');
const defaults = require('./config/defaults');

const n = process.env.ROT || defaults.n;
const plain_text = process.argv[2] || defaults.text;
const cipher_text = Rot.encode(plain_text, n);

console.log('plain:', plain_text, 'cipher:', cipher_text, 'n:', n);
