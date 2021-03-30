import { heey } from './heey'

describe('Test heey!', () => {
    it(`should double the number of e's in hey`, () => {
        const expected = 'heey'
        const actual = heey('hey')
        expect(actual).toBe(expected)
    })
})
