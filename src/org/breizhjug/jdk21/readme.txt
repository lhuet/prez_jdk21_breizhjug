Demo Panama

Step 0: Prepare your project in your favorite IDE
- JDK 20 required
- Use `--enable-preview` flag (With IntelliJ, set the language level to JDK20-preview)

Step 1: Get jextract from https://jdk.java.net/jextract/
wget https://download.java.net/java/early_access/jextract/1/openjdk-21-jextract+1-2_macos-x64_bin.tar.gz
sudo xattr -r -d com.apple.quarantine ~/Documents/perso/breizhjug/prez_jdk21/jextract-21

Step 2: Install the libzstd library (Mac OS)
brew install zstd

Step 3: Prepare the header file if several .h files need to be used (libzstd.h)
API Manual: https://raw.githack.com/facebook/zstd/release/doc/zstd_manual.html

Step 4: Generate Java Code from the C header file
./jextract-21/bin/jextract --source -t org.breizhjug.jdk21.panama.libzstd -lzstd -I/opt/homebrew/Cellar/zstd/1.5.5/include libzstd.h

Step 5: Code your application with the generated Java API
- Use Panama API (java.lang.foreign package)
- Use the generated code (org.breizhjug.jdk21.panama.libzstd.libzstd_h.*)

Step 6: Execute your application with java.library.path configured
- in my case: `-Djava.library.path=/opt/homebrew/Cellar/zstd/1.5.5/lib`