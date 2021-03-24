import { first } from './first'

describe('first', () => {
    it('should pick first in a list', () => {
        let result = first([4, 2, 1])
        expect(result).toBe(4)
    })
    test.todo('should handle empty lists')
})
