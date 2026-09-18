# SAI Voice OS

A mobile-style voice-first operating system interface built with Kotlin, Compose Multiplatform, and Kotlin/Wasm.

## Web

The project is designed to run in a browser and can be published with GitHub Pages.

Build the production WebAssembly distribution:

```bash
gradle :webApp:wasmJsBrowserDistribution
```

The generated site is created under:

```
webApp/build/dist/wasmJs/productionExecutable
```

## Status

UI prototype only. Voice commands, local computer control, internet actions, GitHub integration, and document processing will be added separately.
