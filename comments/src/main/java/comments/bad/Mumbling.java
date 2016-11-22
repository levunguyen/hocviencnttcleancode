package comments.bad;

public class Mumbling {

	/*
	 * Put in a comment just because you feel you should or because the process
	 * requires it, is a hack. If you decide to write a comment, then spend the
	 * time necessary to make sure it is the best comment you can write
	 */

	public void loadProperties() {
		try {
			String propertiesPath = propertiesLocation + "/" + PROPERTIES_FILE;
			FileInputStream propertiesStream = new FileInputStream(propertiesPath);
			loadedProperties.load(propertiesStream);
		} catch (IOException e) {
			// No properties files means all defaults are loaded
		}
	}

			/*what does that comment in the catch block mean? 
			Clearly it meant something to the author, but the meaning does not come through all that well. 
			Apparently, if we get an IOException, it means that there was no properties file; and in that case all the defaults are
			loaded. But who loads all the defaults? Were they loaded before the call to
			loadProperties.load? Or did loadProperties.load catch the exception, load the defaults,
			and then pass the exception on for us to ignore? Or did loadProperties.load load all the
			defaults before attempting to load the file? Was the author trying to comfort himself about
			the fact that he was leaving the catch block empty? Or—and this is the scary possibility—
			was the author trying to tell himself to come back here later and write the code that would
			load the defaults?*/
}
