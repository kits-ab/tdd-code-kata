const { hello } = require("./index");
describe("hello function", () => {
  test("Simple case", () => {
    expect(hello("planet!")).toEqual("Hello planet!");
  });
  test("null", () => {
    expect(() => hello(null)).toThrowError("Not a string");
  });
});
