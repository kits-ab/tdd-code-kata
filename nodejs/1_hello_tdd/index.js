const hello = name => {
  if (typeof name !== "string") throw Error("Not a string");
  return `Hello ${name}`;
};

module.exports = {
  hello,
};
