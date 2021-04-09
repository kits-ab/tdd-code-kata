import * as fs from 'fs';
import * as path from 'path';

export const readBlogFiles = () =>
  new Promise((res, rej) => {
    fs.readdir(path.resolve('posts'), (err, data) => {
      res(data);
    });
  });

export type BlogPost = {
  title: string;
  content: string;
  date: Date;
};

export const parseFile = (fileContents): BlogPost => {
  return {
    title: 'sdfj',
    content: 'sldfj',
    date: new Date('2018-08-29'),
  };
};
