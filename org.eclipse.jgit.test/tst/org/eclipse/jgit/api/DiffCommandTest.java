import org.eclipse.jgit.junit.RepositoryTestCase;
		write(resolve(db.getWorkTree(), "test.txt"), "test");
		File folder = resolve(db.getWorkTree(), "folder");
		write(resolve(folder, "folder.txt"), "folder");
		write(resolve(folder, "folder.txt"), "folder change");
		write(resolve(db.getWorkTree(), "test.txt"), "test");
		File folder = resolve(db.getWorkTree(), "folder");
		write(resolve(folder, "folder.txt"), "folder");
		write(resolve(db.getWorkTree(), "test.txt"), "test");
		File folder = resolve(db.getWorkTree(), "folder");
		write(resolve(folder, "folder.txt"), "folder");
		write(resolve(folder, "folder.txt"), "folder change");
		write(resolve(folder, "folder.txt"), "second folder change");
		write(resolve(db.getWorkTree(), "test.txt"), "test");
		write(resolve(db.getWorkTree(), "test.txt"), "test change");
		write(resolve(db.getWorkTree(), "test.txt"),
		write(resolve(db.getWorkTree(), "test.txt"),