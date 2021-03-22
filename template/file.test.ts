import { something } from './file'

describe('Tests something', () => {
    test('something is nothing', () => {
        const nothing = undefined
        expect(something).toBe(nothing)
    })
})
