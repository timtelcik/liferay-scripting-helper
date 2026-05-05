# Liferay Scripting Helper

The *Scripting Helper* is an improved interface for administrators to run Groovy scripts in Liferay DXP. It features an editor, error trace reporting and an ability to save/load scripts and import/export them as zip files.

## Supported products

* Liferay DXP 7.4.13 (2026.Q1.5)
* Liferay Portal 7.4.3 GA132 (2025.Q1)
* Liferay DXP 7.3
* Liferay DXP 7.2
* Liferay DXP 7.1
* Liferay DXP 7.0
* Liferay Portal 6.2
* Liferay Portal 6.1

## Usage

Administrators will see a new *Scripting Helper* option in the Control Panel menu of Liferay DXP. Other users can also be assigned permissions to see the *Scripting Helper*.

![Scripting Helper](/docs/images/scripting-helper-7.3-menu.png "Scripting Helper")

The *Scripting Helper* allows you to run a Groovy script, see the output or errors. You can then save multiple scripts and export the saved scripts as a ZIP file to import into another Liferay Portal/DXP installation.

![Scripting Helper](/docs/images/scripting-helper-7.3-portlet.png "Scripting Helper")

The [CodeMirror](http://codemirror.net) library is utilised as the editor and supports a range of languages and editor themes.


## Downloads

Download the *Scripting Helper* from the [Liferay Marketplace](https://www.liferay.com/marketplace/-/mp/application/25618082 "Liferay Scripting Helper").


## Installation

Copy the file `Scripting Helper.lpkg` package to the `deploy` folder of your Liferay Portal/DXP installation.


## Dependencies

* JDK 21+
* Maven 3.9+
* Gradle 3.9+ and Liferay Workspace


## Build and Package

* NOTE: The project can be built from source code using Maven or Gradle with a Liferay Workspace.

## Build and Package using Maven

### Step 1. Check out source code from GitHub to work folder

e.g.

```bash
% cd <YOUR_WORK_FOLDER>

% git clone https://github.com/campfire-digital-services/liferay-scripting-helper.git
```

### Step 2. Build and package the module

e.g.

```bash
% cd <YOUR_WORK_FOLDER>/liferay-scripting-helper

% mvn -U clean package
```

* NOTE: This will create a package called `liferay-scripting-helper-portlet.jar` in the `target` folder.


## Build and Package using Gradle

### Step 1. Check out source code from GitHub to Liferay Workspace

e.g.

```bash
% cd <YOUR_LIFERAY_WORKSPACE>/modules

% git clone https://github.com/campfire-digital-services/liferay-scripting-helper.git
```

### Step 2. Build and package

e.g.

```bash
% cd <YOUR_LIFERAY_WORKSPACE>/modules/liferay-scripting-helper

% ../../gradlew clean build
```

* NOTE: This build step create a package called `xxx.liferay.scripting.jar` in the `build/libs` folder.


## Licence

This application is released under the GNU Public License version 3.0 (GPL). The codemirror library is also included in the package and comes under a MIT-style license.


## Project team

* Chun Ho - chun.ho@campfire.com.au
* Terry Mueller - terry.mueller@campfire.com.au
* Flavius Daca - flavius.daca@campfire.com.au
* Tim Telcik - telcik@gmail.com
