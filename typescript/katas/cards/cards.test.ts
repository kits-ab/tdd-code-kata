import {
    createDeck,
    shuffle,
    sort,
    CLUBS_SUIT,
    HEART_SUIT,
    DIAMOND_SUIT,
    SPADE_SUIT,
} from './cards'

describe('Test Deck creation', () => {
    const isArrayUnique = (arr: Array<object>) =>
        Array.isArray(arr) && new Set(arr).size === arr.length

    test.only('creates a 52 card Deck', () => {
        const expected = 52
        const actual = createDeck().length
        expect(actual).toBe(expected)
    })
    test('creates 13 unique cards of clubs suit', () => {
        const expected = 13
        const actual = createDeck().filter((card) => card.suit === CLUBS_SUIT)
        expect(isArrayUnique(actual)).toBeTruthy()
        expect(actual.length).toBe(expected)
    })
    test('creates 13 unique cards of heart suit', () => {
        const expected = 13
        const actual = createDeck().filter((card) => card.suit === HEART_SUIT)
        expect(isArrayUnique(actual)).toBeTruthy()
        expect(actual.length).toBe(expected)
    })
    test('creates 13 unique cards of spade suit', () => {
        const expected = 13
        const actual = createDeck().filter((card) => card.suit === SPADE_SUIT)
        expect(isArrayUnique(actual)).toBeTruthy()
        expect(actual.length).toBe(expected)
    })
    test('creates 13 unique cards of diamond suit', () => {
        const expected = 13
        const actual = createDeck().filter((card) => card.suit === DIAMOND_SUIT)
        expect(isArrayUnique(actual)).toBeTruthy()
        expect(actual.length).toBe(expected)
    })
    test('creates 13 unique cards of diamond suit', () => {
        const actual = createDeck().filter((card) => card.suit === DIAMOND_SUIT)

        expect(actual.length).toBe(13)
    })
    test.todo('Creates all 13 ranks in a suit')
})

describe('Deck shuffle', () => {
    test('Should change order of cards', () => {
        const deck = createDeck()
        const actual = shuffle(deck)
        expect(actual).not.toEqual(deck)
    })
    test('Should not remove any cards', () => {
        const deck = createDeck()
        const actual = shuffle(deck).length
        const expected = deck.length
        expect(actual).toEqual(expected)
    })
    test('Should properly shuffle deck', () => {
        const deck = createDeck()
        const actual = shuffle(deck)
        const expected = deck.reverse()
        expect(actual).not.toEqual(expected)
    })
    test.todo('Should not change cards in deck')
})

describe('Deck sort', () => {
    test('Should change order of cards', () => {
        const shuffledDeck = shuffle(createDeck())
        const actual = sort(shuffledDeck)
        expect(actual).not.toEqual(shuffledDeck)
    })
    test('Should not remove any cards', () => {
        const deck = createDeck()
        const actual = sort(deck).length
        const expected = deck.length
        expect(actual).toEqual(expected)
    })
    test('Should properly sort the deck', () => {
        const shuffledDeck = shuffle(createDeck())
        const actual = sort(shuffledDeck)
        const expected = createDeck()
        expect(actual).toEqual(expected)
    })
})
