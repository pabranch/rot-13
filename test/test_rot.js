const assert = require('assert');
const Rot = require('../src/rot');

describe('Rot', () => {
  
  describe('#encode()', () => {
    it('test lowercase', () => {
      assert.equal(Rot.encode('abc', 13), 'nop');
    });
    it('test uppercase', () => {
      assert.equal(Rot.encode('ABC', 13), 'NOP');
    });
    it('ignore spaces, numbers, punctuation', () => {
      assert.equal(Rot.encode('ABC +- xyz', 13), 'NOP +- klm');
    });
    it('set n to 5', () => {
      assert.equal(Rot.encode('abc', 5), 'fgh');
    });
    it('set n to 500', () => {
      assert.equal(Rot.encode('abc', 500), 'ghi');
    });
  });
  
});
