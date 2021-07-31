# Commands

### How to add your info to lab computer for git:
```bash
$ git config --global user.name "Your Name Comes Here"
$ git config --global user.email you@yourdomain.example.com
```

You can also view the config file with
```bash
$ git config --list
```

or

```bash
$ cat ~/.gitconfig
```

### Initialize a new git repo
```bash
$ git init
```
- *usually done at git*

### Cloning an existing repo
```bash
$ git clone <path to repo (url)>
```
- *no angle brackets just type git clone then paste the url from git*

This will set the remote

### Add changes
```bash
$ git add <file name>
```
You can use `.` to add all changes in the current directory

Many revision control systems provide an add command that tells the system to start tracking changes to a new file. Git’s add command does something simpler and more powerful: git add is used both for new and newly modified files, and in both cases it takes a snapshot of the given files and stages that content in the index, ready for inclusion in the next commit.

### Save changes
```bash
$ git commit -m "Your commit message"
```

If you do not use the `-m` message flag, the terminal will open an editor to write and save your message

### Quickly save file updates
```bash
$ git commit -a
```

Will automatically notice any modified (but not new) files, add them to the index, and commit, all in one step

### Get a brief summary of the changed files
```bash
$ git status
```

### Look at the differences from the previous commit
```bash
$ git diff --cache
```

Without `--cached`, git diff will show you any changes that you’ve made but not yet added to the index.

### View project history
```bash
$ git log
```

Use the `-p` to see complete diffs at each step

Use `--stat --summary` to get an overview

### Show a graphical representation of the history
```bash
$ gitk
```

### Show details of changes
```bash
$ git show <commit hash>
$ git show c82a22c39c	# the first few characters of the name are usually enough
$ git show HEAD		# the tip of the current branch
$ git show experimental	# the tip of the "experimental" branch
$ git show HEAD^  # to see the parent of HEAD
$ git show HEAD^^ # to see the grandparent of HEAD
$ git show HEAD~4 # to see the great-great grandparent of HEAD
$ git show HEAD^1 # show the first parent of HEAD (same as HEAD^)
$ git show HEAD^2 # show the second parent of HEAD
```

### Give your commit a name (tag)
```bash
git tag <name> <commit hash>
```

After a commit has a tag, you can refer to it by that tag opposed to using the hash

### View branches
```bash
$ git branch
```

### Create a new branch
```bash
$ git branch <branch name>
```

### Switch a different branch
```bash
git switch <branch name>
```

or

```bash
git checkout <branch name>
```

Note: `switch` is the newer version and identical to checkout in this regard
https://bluecast.tech/blog/git-switch-branch/

### Merging branches
```bash
$ git merge <branch name>
```

This will merge the branch you picked into the branch you are on.

If there are conflicts, you will need to resolve them before continuing

When resolving conflicts, make changes then do git add **.** 
git merge --continue

### Delete a branch
```bash
$ git branch -d <branch name>
```
Soft delete, won't delete unless changes are in the current branch

```bash
$ git branch -D <branch name>
```
Hard delete, this branch won't exist anymore even if there were unsave changes

### Setting a remote for upstream collaboration
```bash
$ git remote add <remote name> <path to upstream repo (url)>
```

### View remotes
```bash
$ git remote
```

### Check for changes from other collaborators
```bash
$ git fetch <remote name> <branch name>
$ git log -p HEAD..FETCH_HEAD
```

This is safe even if you have unsaved changes

To visulize the collaborators changes without any you might have made, use the exclusion range (..)
```bash
$ gitk HEAD..FETCH_HEAD
```

To visulize all changes use the inclusion range (...)
```bash
$ gitk HEAD...FETCH_HEAD
```

If everything looks good, you can merge the changes

### Pull changes
```bash
$ git pull <remote name> <branch name>
```

This will fetch and merge. If there are any unsaved changes, they are lost.