import SwiftUI
import shared

struct ContentView: View {
	let greet = Greeting().greeting()
    let string = Greeting().getMyString().localized()

	var body: some View {
        VStack{
            Text(greet)
            Text(string)
        }
		
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
	ContentView()
	}
}
