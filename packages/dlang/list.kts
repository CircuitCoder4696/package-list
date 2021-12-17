fun genPackageList(PackageManager packageManager) {
  packageManager list repository("cuda-d",NoVersionSet,"https://github.com/prasunanand/cuda_d/archive/refs/heads/master.zip")
  packageManager list repository("vibe-d",NoVersionSet,"https://github.com/vibe-d/vibe.d/archive/refs/heads/master.zip")
  packageManager list repository("vibe-d","0.9.3","https://github.com/vibe-d/vibe.d/archive/refs/tags/v0.9.3.zip")
  packageManager list repository("vibe-d","0.9.2","https://github.com/vibe-d/vibe.d/archive/refs/tags/v0.9.2.zip")
  packageManager.otherLang("C","importC") list repository("lua-embed",NoVersionSet,"https://github.com/klassmann/blog-embedding-lua-in-c/archive/refs/heads/master.zip")
};
