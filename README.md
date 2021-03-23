# Code Kata typescript style

## Setup
1. Get a MacBook
2. Install [homebrew](https://brew.sh/)
```code
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```
3. Install nvm 
```code
$ brew install nvm
```
4. Run following in this folder
```code
nvm use
```
If error:
```code
Found '~/tdd-code-kata.git/.nvmrc' with version <14>
N/A: version "14 -> N/A" is not yet installed.

You need to run "nvm install 14" to install it before using it.
```
Run following
```code
$ nvm install 14
Downloading and installing node v14.16.0...
Now using node v14.16.0 (npm v6.14.11)
```
5. Install yarn
```code
npm i -g yarn
```
## Develop

### First time
```code
cd <root-dir>
yarn install
yarn test
```

### Every time

```code
cp -r template src/<my-kata-name>

cd src/<my-kata-name>

mv file.ts <my-kata-name>.ts
mv file.test.ts <my-kata-name>.test.ts

yarn install
yarn watch
```

start hacking!
### After hacking complete
```code
cd <root-dir>
yarn clean-all
```
