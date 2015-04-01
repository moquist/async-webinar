## Usage

Install [Leiningen](http://leiningen.org). Then run the following from the 
project directory:

```shell
lein figwheel
```

After your code compiles for the first time, you'll see a Clojurescript REPL
waiting for a connection from your browser.

Browse to http://localhost:3449 and your Clojurescript REPL will become live. In
your REPL, do this to get into the right namespace:

```clojure
(in-ns 'meet-async.core)
```

Then open up your browser's debugging console, and walk through the examples in
your browser.

You can edit ```src/meet_async/core.cljs``` in your preferred text
editor and your changes will be live-loaded by ```lein figwheel```.
