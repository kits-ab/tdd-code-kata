import { heey } from './heey'

describe('Test heey!', () => {
    it(`should double the number of e's in hey`, () => {
        const expected = 'heey'
        const actual = heey('hey')
        expect(actual).toBe(expected)
    })
    it(`should add a lot of eeees`, () => {
        const expected = 'heeeeeeeeeey'
        const actual = heey('heeeeey')
        expect(actual).toBe(expected)
    })
})
