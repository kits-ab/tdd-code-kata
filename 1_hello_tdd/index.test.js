const { hello } = require("./index");
test("Simple case", () => {
  expect(hello("planet!")).toEqual("Hello planet!");
});
