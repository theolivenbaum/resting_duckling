# resting_duckling

Simple rest-server for the wit.ai's duckling natural language parser

## Installation

If you don't have lein installed, run first: 'lein.bat self-install'
Otherwise, simple start by running 'start-resting-duckling.bat'

## Usage

Place GET requests to http://localhost:port/en/module/text%20input%20to%20parse, replacing module with the desired module from duckling.
Available modules are: time, temperature, number, ordinal, distance, volume, amount-of-money, duration, email, url, phone-number
It should be straightforward to add the other languages (just need to define new routes - feel free to place a push request if you do it!)

## Options

You can change the port the server listen to by editing the start-resting-ducking-bat script. Default is 3003.

## License

Copyright © 2017 Rafael Oliveira

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
