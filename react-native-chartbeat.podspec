require "json"

package = JSON.parse(File.read(File.join(__dir__, "package.json")))

Pod::Spec.new do |s|
  s.name         = "react-native-chartbeat"
  s.version      = package["version"]
  s.summary      = package["description"]
  s.description  = <<-DESC
                  Chartbeat native module
                   DESC
  s.homepage     = "https://github.com/cisclub/react-native-chartbeat#readme"
  # brief license entry:
  s.license      = "MIT"
  # optional - use expanded license entry instead:
  # s.license    = { :type => "MIT", :file => "LICENSE" }
  s.authors      = { "cisclub" => "yourname@email.com" }
  s.platforms    = { :ios => "9.0" }
  s.source       = { :git => "https://github.com/author/RNChartbeat.git", :tag => "#{s.version}" }

  s.source_files = "ios/**/*.{h,m,swift}"
  s.requires_arc = true

  s.dependency "React"
  s.dependency "Chartbeat"
  
end
