<p align="center"><a href="https://github.com/anuraghazra/github-readme-stats">
  <img align="center" src="https://github-readme-stats.vercel.app/api?username=ChrisTitusTech&show_icons=true&theme=tokyonight" />
</a></p>

<p align="center"><a href="https://wakatime.com/@bufkin">
  <img align="center" width="400" height="300" src="https://wakatime.com/share/@Bufkin/a4b7b189-6979-48c1-b94c-0438c45e9d8f.svg" />
</a>
<a href="https://wakatime.com/@Bufkin">
  <img align="center" width="400" height="300" src="https://wakatime.com/share/@Bufkin/f03d1fcf-71cc-4b1f-851f-55a5ad3aaf0d.svg" />
</a></p>

<p align="center"><a href="https://wakatime.com/@Bufkin">
  <img align="center" width="400" height="300" src="https://wakatime.com/share/@Bufkin/5c5b5eea-2833-4fd8-95fa-73038f55f764.svg" />
</a>
<a href="https://wakatime.com/@Bufkin">
  <img align="center" width="400" height="300" src="https://wakatime.com/share/@Bufkin/194b00e8-5ae7-414c-b350-4e3442178cb7.svg" />
</a></p>

### 👷 Check out what I'm currently working on
{{ range recentContributions 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}
### 🌱 My latest projects
{{ range recentRepos 5 }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{- end }}
### 🔨 My recent Pull Requests
{{ range recentPullRequests 5 }}
- [{{ .Title }}]({{ .URL }}) on [{{ .Repo.Name }}]({{ .Repo.URL }})
{{- end }}
### ⭐ Recent Stars
{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}
### 📰 Recent Blog Posts
{{ range rss "https://christitus.com/index.xml" 5 }}
- [{{ .Title }}]({{ .URL }})
{{- end }}
### 📫 How to reach me:
  - Youtube   : <https://youtube.com/c/ChrisTitusTech>
  - Twitch    : <https://twitch.tv/christitustech>
  - Twitter   : <https://twitter.com/christitustech>
  - Website   : <https://christitus.com>
  - Web Store : <https://cttstore.com>
