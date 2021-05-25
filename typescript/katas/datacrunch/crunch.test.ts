import { footballCrunch, weatherCrunch } from './crunch'

describe('Tests football', () => {
    test('Should find team with largest point difference', async () => {
        const expected = 'IFK'
        const actual = await footballCrunch('./data/Fotboll_1996.dat')
        expect(actual).toBe(expected)
    })
})

describe('Tests weather', () => {
    test('Should find day with largest temperature difference', async () => {
        const expected = '16'
        const actual = await weatherCrunch('./data/Mars_2021.dat')
        expect(actual).toBe(expected)
    })
})
