package comments.bad;

public class CommentOutCode {

	/*There was a time, back in the sixties, when commenting-out code might have been
	useful. But we’ve had good source code control systems for a very long time now. Those
	systems will remember the code for us. We don’t have to comment it out any more. Just
	delete the code. We won’t lose it. Promise*/
	
	
	InputStreamResponse response = new InputStreamResponse();
	response.setBody(formatter.getResultStream(), formatter.getByteCount());
	// InputStream resultsStream = formatter.getResultStream();
	// StreamReader reader = new StreamReader(resultsStream);
	// response.setContent(reader.read(formatter.getByteCount()));
}
