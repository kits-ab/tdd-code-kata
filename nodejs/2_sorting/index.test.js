const { sort } = require("./index");

describe("Sorting", () => {
  test("sorting array of numbers", () => {
    expect(sort([4, 1, 2, 4, 5, 2, 4, 6, 8])).toEqual([
      1,
      2,
      2,
      4,
      4,
      4,
      5,
      6,
      8,
    ]);
  });
  test("sorting an array of strings alphabetically", () => {
    expect(sort(["js", "css", "kotlin", "ada", "c++"])).toEqual([
      "ada",
      "c++",
      "css",
      "js",
      "kotlin",
    ]);
  });
  test("sorting an array of objects", () => {
    const objects = [
      {
        title: "Hello",
        date: "2021-05-04T23:23:512.932Z",
      },
      {
        title: "it's me",
        date: "2021-01-02T13:54:37.803Z",
      },
      {
        title: "I've been wondering",
        date: "2021-03-23T07:26:27.803Z",
      },
    ];
    const sortedObjects = [
      {
        title: "it's me",
        date: "2021-01-02T13:54:37.803Z",
      },
      {
        title: "I've been wondering",
        date: "2021-03-23T07:26:27.803Z",
      },
      {
        title: "Hello",
        date: "2021-05-04T23:23:512.932Z",
      },
    ];
    expect(sort(objects, "date")).toEqual(sortedObjects);
  });
});
