### Hi there 👋
# My Termux setup

Here is My Termux Terminal Emulator Setup &amp; Packages 🔖

> Linux on Android 💯

## Download Termux

Termux Terminal Emulator for Android

~~Get it from Google Play store 💯~~

- ~~Install Termux - <https://play.google.com/store/apps/details?id=com.termux&hl=en>~~
- ~~Install Termux API  - <https://play.google.com/store/apps/details?id=com.termux.api&hl=en>~~
- ~~Install Termux Styling - <https://play.google.com/store/apps/details?id=com.termux.styling>~~

- Download Termux from F-Driod - <https://f-droid.org/packages/com.termux/>
- All Termux Apps - <https://search.f-droid.org/?q=termux&lang=en>
- Termux Support was dropped from Playstore - <https://github.com/termux/termux-app#installation>

## My Setup & Packages

- Update Termux Packages

```bash
pkg up
```

- Install cURL

```bash
pkg install curl
```

- Install git

```bash
pkg install git
```

- Install wget

```bash
pkg install wget
```

- Install python3 & python2 (<https://wiki.termux.com/wiki/Python>)

### Python2

```bash
pkg Install python2
```

### Python3

```bash
pkg install python
```
termux-reload-settings
~/.termux/termux.properties
key=value
use-black-ui = true
fullscreen = true
use-fullscreen-workaround = true
pkg install busybox termux-services
source $PREFIX/etc/profile.d/start-services.sh
sv-enable ftpd
sv up ftpd

- Install Nodejs

```bash
pkg install nodejs
```

- Install jq (pre Format JSON result)

```bash
pkg install jq
```

- Install libxml2-utils

```bash
pkg install libxml2-utils
```

- Install grep (about grep - <https://en.wikipedia.org/wiki/Grep>)

```bash
pkg install grep
```

- Install bc (Arbitrary Precision Calculator language)

```bash
pkg install bc
```

- Install htop (Task manager & system Monitor)

```bash
pkg install htop
```

- Install figlet

```bash
pkg install figlet
```

- Install httping (pinging tool for HTTP requests)

```bash
pkg install httping
```

- install dnsutils (Mostly i use this tool for find the website/blog IP address)

```bash
pkg install dnsutils
```

- Install openssh (For Managing My Servers SSH & SFTP)

```bash
pkg install openssh
```

- Install FFmpeg (Handling video, audio, and other multimedia files and streams)

```bash
pkg install ffmpeg
```

- Install youtube-dl

```bash
curl -sL https://gist.githubusercontent.com/mskian/6ea9c2b32d5f41867e7cafc88d1b26d5/raw/youtube-dl.sh | bash
```

- Install PHP

```bash
pkg install php
```

- Install PHP Composer on Termux

```bash
curl -sS https://getcomposer.org/installer | php -- --install-dir=/data/data/com.termux/files/usr/bin --filename=composer
```

- Install nano Editor

```bash
pkg install nano
```

- Install ZSH (For Run ohmyzsh)

```bash
pkg install zsh
```

- Install **HTTPie** on Termux (cURL Alternative) and Install Socks for Proxy Connection [Python3 Modules]

```bash
pip install --upgrade pip setuptools
```

```bash
pip install --upgrade httpie
```

```bash
pip install -U requests[socks]
```

```bash
pip install requests
```

- Required packages for Python development

```bash
pkg install clang python-dev
```

```bash
pkg install libffi-dev
```

```bash
pkg install openssl-dev
```

- DuckDuckGo for Termux

```bash
pip install ddgr
```

- Install screenfetch (System Information Generator)

```bash
pkg install screenfetch
```

- Install w3m - Text based Web browser

```bash
pkg install w3m
```

- Customize the Termux Terminal Emulator - <https://amsk.in/2IF0ibt>

- Install `Termux-exec` Read More about this Package - <https://wiki.termux.com/wiki/Termux-exec>

```bash
pkg install termux-exec
```

- Install Termux API (Full info about this - <https://wiki.termux.com/wiki/Termux:API> (Don't Forget to Install Termux API APP from Playstore)

```bash
pkg install termux-api
```

- Termux SD Card Permission ( <https://wiki.termux.com/wiki/Termux-setup-storage> )

```bash
pkg up
```

```bash
termux-setup-storage
```

- Termux Enable Extra Key Rows

```bash
cd .termux
```

```bash
nano termux.properties
```

> Copy and Paste the Below Key Configuration in the Termux Properties File - `CTRL + X` to save & Exit

```bash
extra-keys = [ \
 ['ESC','|','/','HOME','UP','END','PGUP','DEL'], \
 ['TAB','CTRL','ALT','LEFT','DOWN','RIGHT','PGDN','BKSP'] \
]
```

- Termux Fix Legacy Warning - <https://github.com/termux/termux-app/issues/1393>

```bash
termux-upgrade-repo
```

Termux Storage permission did not create symlink for all folders - ( <https://github.com/termux/termux-app/issues/591> )

```bash
cd $HOME
ls
```

- Termux - Check if a program/Package is exists or Not (Verify your Package Installation)

```bash
curl -sL https://gist.githubusercontent.com/mskian/4278fed4a206f4ec440f0dd512d4540b/raw/package.sh | bash
```

- List the Installed Packages

```bash
pkg list-installed
```

- Uninstall/Remove Packages

```bash
pkg uninstall <package-name>
```

- Clear bash Path cache

```bash
hash -r
```

- Termux Help

```bash
pkg help
```

- Enable Extra Keys ( <https://wiki.termux.com/wiki/Touch_Keyboard> ) **Volume UP+Q**

Learn More about Termux Visit - <https://termux.com/>

Bookmark this Page More Updates on the way 😊

<!--
**aaytaccc/aaytaccc** is a ✨ _special_ ✨ repository because its `README.md` (this file) appears on your GitHub profile.

Here are some ideas to get you started:

- 🔭 I’m currently working on ...
- 🌱 I’m currently learning ...
- 👯 I’m looking to collaborate on ...
- 🤔 I’m looking for help with ...
- 💬 Ask me about ...
- 📫 How to reach me: ...
- 😄 Pronouns: ...
- ⚡ Fun fact: ...
-->
