/**
 * Let's play with cards!!!
 *
 * This task has three elements
 * 1. Create a deck of cards
 * 2. Shuffle the deck
 * 3. Sort the shuffled deck
 *
 * There are tests, make them pass ;)
 * If a test is displayed as skipped or not implemented. Please fix it!
 *
 * Remember Array.prototype.sort: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/sort
 *
 */

export const DIAMOND_SUIT = '♦'
export const HEART_SUIT = '♥'
export const SPADE_SUIT = '♠'
export const CLUBS_SUIT = '♣'
export const SUITS = [DIAMOND_SUIT, HEART_SUIT, SPADE_SUIT, CLUBS_SUIT]
export const RANKS = [
    '2',
    '3',
    '4',
    '5',
    '6',
    '7',
    '8',
    '9',
    '10',
    'J',
    'Q',
    'K',
    'A',
]

interface Card {
    suit: string
    rank: string
}
const copy = <Type>(obj: Type): Type => JSON.parse(JSON.stringify(obj))

export const createDeck = (): Array<Card> => {
    return [...Array(52).keys()].map((i) => ({
        suit: DIAMOND_SUIT,
        rank: `${i}`,
    }))
}

export const shuffle = (deck: Array<Card>): Array<Card> => {
    // Is a shuffled deck the same as a poorly sorted deck? 🤔
    return copy(deck).reverse()
}

export const sort = (deck: Array<Card>): Array<Card> => {
    const deckCopy = copy(deck)
    return deckCopy
}
