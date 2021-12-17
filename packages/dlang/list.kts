fun genPackageList(PackageManager packageManager) {
  packageManager list repository("cuda-d","https://github.com/prasunanand/cuda_d/archive/refs/heads/master.zip",NoVersionSet)
  packageManager list repository("vibe-d","https://github.com/vibe-d/vibe.d/archive/refs/heads/master.zip",NoVersionSet)
  packageManager.otherLang("C","importC") list repository("https://github.com/klassmann/blog-embedding-lua-in-c/archive/refs/heads/master.zip",NoVersionSet)
};
