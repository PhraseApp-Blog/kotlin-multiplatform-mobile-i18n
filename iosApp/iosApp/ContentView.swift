import SwiftUI
import shared

let displayName = "John"


struct ContentView: View {
    
    @State var sliderValue: Double = 0
    let text = Text()
    let greet = Text().getGreetingWithName(name: displayName).localized()
    let image = Resources().getImage()
	var body: some View {
        VStack{
            HStack{
            Text(greet)
                Spacer()
            }.font(.system(size: 40))
            .padding(.bottom, 20)
            Image(uiImage: (image?.toUIImage()!)!).resizable().scaledToFit().padding(.bottom, 20)
            HStack{
                Text(Text().getSelectQuantity().localized())
                Spacer()
            }.font(.system(size: 30)).padding(.bottom, 40)
            Slider(value: $sliderValue, in: 0...5, step: 1)
            Spacer()
        }.padding(20)
        Text(Text().getMyPluralFormattedDesc(quantity:Int32(Int(sliderValue))).localized()).bold().font(.system(size: 60)).padding(.bottom, 60)
      
    }
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
	ContentView()
	}
}
