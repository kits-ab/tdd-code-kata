import { promises } from 'fs'

/**
 * Filen Allsvenskan_1996.dat innehåller konstigt nog resultatet från allsvenskan 1996.
 * Kolumnerna märkta ‘GM’ (Gjorda Mål) och ‘IM’ (Insläppta Mål) innehåller det antal mål som laget gjort respektive släppt in,
 * ex. Degerfors gjorde 34 och släppte in 41.
 *
 * UPPGIFT: Skriv ett program som skriver ut det lag som har störst differens mellan gjorda och insläppta mål.
 *
 * @param footballDataPath - Sökvägen till en fil med fotbollsdata
 * @returns Det lag som hade störst skillnad mellan gjorda och insläppta mål
 */
export const footballCrunch = async (
    footballDataPath: string
): Promise<string> => {
    const lines = (await promises.readFile(footballDataPath, 'utf-8')).split(
        /\r?\n/
    )
    const linesOfData = lines.map((line) => line.split(/\s+/))
    return ''
}

/**
 * Filen Mars_2021.dat innehåller väderdata från Göteborg under månaden mars.
 * Kolumnerna märkta MaxTmp och MinTmp innehåller högsta respektive lägsta temperaturerna under dagen.
 *
 * UPPGIFT: Skriv ett program som returnerar det datum där temperaturdifferensen var som störst
 *
 * @param weatherDataPath - Sökvägen till en fil med väderdata
 * @returns Det datum då temperaturdifferensen var som störst
 */
export const weatherCrunch = async (
    weatherDataPath: string
): Promise<string> => {
    const lines = (await promises.readFile(weatherDataPath, 'utf-8')).split(
        /\r?\n/
    )
    const linesOfData = lines.map((line) => line.split(/\s+/))
    return ''
}
