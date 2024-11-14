#Git Commands

In project root folder<br/>
1. git init <br/>

Add files to staging<br/>
2. git add * <br/>

Commit files to local repo<br/>
3. git commit -m "first commit"<br/>

Change branch name<br/>
4. git branch -m main<br/>

Link up remote repot to local repo<br/>
5. git remote add origin <repo link>
    
push code up from local repo to remote repo<br/>
6. git push -u origin main <br/>                 

#Maven Compiler command

In project root folder<br/>
clean: cleans up target folder. good for updating dependencies<br/>
1. mvn clean<br/>

package the compiled bytecode classes into jar/war files <br/>
2. mvn package <br/>

delete target, redownload dependencies, recompile to class files, pacakage to jar/war <br/>
3. mvn clean package