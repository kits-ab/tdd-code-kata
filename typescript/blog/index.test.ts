import { readBlogFiles, parseFile, BlogPost } from './index';

describe('', () => {
  test('blog files', async () => {
    const files = await readBlogFiles();
    expect(files).toHaveLength(11);
  });
  test('parse blog file', async () => {
    const files = await readBlogFiles();
    const blogPost = await parseFile(files[0]);
    expect(blogPost.title).toBe('Välkommen till kits.se');
  });
});
