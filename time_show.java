//���̃\�[�X�́AVstoneMagic�ɂ���Ď�����������܂����B
//�\�[�X�̓��e�������������ꍇ�AVstoneMagic�ŊJ���Ȃ��Ȃ�ꍇ������܂��B
package	jp.co.mysota;
import	main.main.GlobalVariable;
import	jp.vstone.RobotLib.*;
import	jp.vstone.sotatalk.*;
import	jp.vstone.camera.*;
import	java.time.*;
import	jp.vstone.sotatalk.SpeechRecog.*;
import	 org.opencv.core.Core;
import	 org.opencv.core.Mat;
import	 org.opencv.core.Point;
import	 org.opencv.core.Scalar;
import	 org.opencv.imgproc.Imgproc;
import	 org.opencv.imgcodecs.Imgcodecs;

public class time_show
{

	public String time_string;
	public String date_string;
	public int getDateTimeElement;
	public LocalDateTime localDateTime;
	public int faceDetectResultAge;
	public String speechRecogResult;
	public time_show()																									//@<BlockInfo>jp.vstone.block.func.constructor,16,16,464,16,False,7,@</BlockInfo>
	{
																														//@<OutputChild>
		/*String time_string*/;																							//@<BlockInfo>jp.vstone.block.variable,80,16,80,16,False,6,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*String date_string*/;																							//@<BlockInfo>jp.vstone.block.variable,144,16,144,16,False,5,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*int getDateTimeElement*/;																						//@<BlockInfo>jp.vstone.block.variable,208,16,208,16,False,4,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*LocalDateTime localDateTime*/;																				//@<BlockInfo>jp.vstone.block.variable,272,16,272,16,False,3,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*int faceDetectResultAge*/;																					//@<BlockInfo>jp.vstone.block.variable,336,16,336,16,False,2,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*String speechRecogResult*/;																					//@<BlockInfo>jp.vstone.block.variable,400,16,400,16,False,1,break@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void main()																									//@<BlockInfo>jp.vstone.block.func,0,256,1008,256,False,18,�R�����g@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		{																												//@<BlockInfo>jp.vstone.block.time.getdatetimeelement,64,256,64,256,False,17,dateTime�ɋL�^���ꂽ������񂩂�A�N�E���E���E���E���E�b�̂������type�Ŏw�肵�A�ϐ�int getDateTimeElement�ɑ������@</BlockInfo>
			LocalDateTime d = (LocalDateTime)localDateTime;
			getDateTimeElement = d.getHour();
		}																												//@<EndOfBlock/>
		if(getDateTimeElement<=11)																						//@<BlockInfo>jp.vstone.block.if,128,160,448,160,False,16,�R�����g@</BlockInfo>
		{
																														//@<OutputChild>
			GlobalVariable.sotawish.Say((String)"���͂悤",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);		//@<BlockInfo>jp.vstone.block.talk.say,256,160,256,160,False,8,@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
		}
		else if(getDateTimeElement<=16)
		{
																														//@<OutputChild>
			if(getDateTimeElement>11)																					//@<BlockInfo>jp.vstone.block.if,192,208,384,208,False,11,�R�����g@</BlockInfo>
			{
																														//@<OutputChild>
				GlobalVariable.sotawish.Say((String)"����ɂ���",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,320,208,320,208,False,9,@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
			}
			else
			{
																														//@<OutputChild>
				GlobalVariable.sotawish.Say((String)"����΂��",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,256,304,256,304,False,10,@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
			}
																														//@<EndOfBlock/>
																														//@</OutputChild>
		}
		else
		{
																														//@<OutputChild>
			GlobalVariable.sotawish.Say((String)"����΂��",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);		//@<BlockInfo>jp.vstone.block.talk.say,320,368,320,368,False,12,@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
		}
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"�ˑR�����ǁA�ʐ^�B��ˁB5�A4�A3�A2�A1�A",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,512,256,512,256,False,15,@</BlockInfo>
																														//@<EndOfBlock/>
		take_picture();																									//@<BlockInfo>jp.vstone.block.callfunc.base,576,256,576,256,False,14,@</BlockInfo>	@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"�B�e�I�������B���肪�Ƃ��B",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,944,256,944,256,False,13,@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void take_picture()																							//@<BlockInfo>jp.vstone.block.func,0,528,304,528,False,23,@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		localDateTime = LocalDateTime.now();																			//@<BlockInfo>jp.vstone.block.time.getlocaldatetime,64,464,64,464,False,22,���[�J�����Ԃ����{�b�g���̃J�����_�[���擾���A�ϐ�LocalDateTime lodalDateTime�ɑ���B�擾������񂩂�����Ȃǂ��ʂɐ؂�o���ꍇ�́u�����̐؂�o���u���b�N�v���g��@</BlockInfo>
																														//@<EndOfBlock/>
		date_string = CRobotUtil.getDateString();																		//@<BlockInfo>jp.vstone.block.time.getdate,96,560,96,560,False,21,���{�b�g���̃J�����_�[��茻�ݔN�����𕶎���Ŏ擾���A�ϐ�String date_string�ɑ���B@</BlockInfo>
																														//@<EndOfBlock/>
		time_string = CRobotUtil.getTimeString();																		//@<BlockInfo>jp.vstone.block.time.gettime,160,560,160,560,False,20,���{�b�g���̃J�����_�[��茻�ݎ����𕶎���Ŏ擾���A�ϐ�String time_string�ɑ���B@</BlockInfo>
																														//@<EndOfBlock/>
		{																												//@<BlockInfo>jp.vstone.block.facedetect.stillpicture,224,560,224,560,False,19,still@</BlockInfo>
			String filepath = "/var/sota/photo/";
			filepath += (String)"picture";
			boolean isTrakcing=GlobalVariable.robocam.isAliveFaceDetectTask();
			if(isTrakcing) GlobalVariable.robocam.StopFaceTraking();
			GlobalVariable.robocam.initStill(new CameraCapture(CameraCapture.CAP_IMAGE_SIZE_5Mpixel, CameraCapture.CAP_FORMAT_MJPG));
			GlobalVariable.robocam.StillPicture(filepath);

			CRobotUtil.Log("stillpicture","save picthre file to \"" + filepath +"\"");
			if(isTrakcing) GlobalVariable.robocam.StartFaceTraking();
		}																												//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

	//@<Separate/>
	/*
	date_string = CRobotUtil.getDateString();																			//@<BlockInfo>jp.vstone.block.time.getdate,816,48,816,48,False,26,���{�b�g���̃J�����_�[��茻�ݔN�����𕶎���Ŏ擾���A�ϐ�String date_string�ɑ���B@</BlockInfo>
																														//@<EndOfBlock/>
	time_string = CRobotUtil.getTimeString();																			//@<BlockInfo>jp.vstone.block.time.gettime,880,48,880,48,False,25,���{�b�g���̃J�����_�[��茻�ݎ����𕶎���Ŏ擾���A�ϐ�String time_string�ɑ���B@</BlockInfo>
																														//@<EndOfBlock/>
	{																													//@<BlockInfo>jp.vstone.block.facedetect.stillpicture,944,48,944,48,False,24,still@</BlockInfo>
		String filepath = "/var/sota/photo/";
		filepath += (String)"picture";
		boolean isTrakcing=GlobalVariable.robocam.isAliveFaceDetectTask();
		if(isTrakcing) GlobalVariable.robocam.StopFaceTraking();
		GlobalVariable.robocam.initStill(new CameraCapture(CameraCapture.CAP_IMAGE_SIZE_5Mpixel, CameraCapture.CAP_FORMAT_MJPG));
		GlobalVariable.robocam.StillPicture(filepath);
		CRobotUtil.Log("stillpicture","save picthre file to \"" + filepath +"\"");
		if(isTrakcing) GlobalVariable.robocam.StartFaceTraking();
	}																													//@<EndOfBlock/>
	*/

	//@<Separate/>
	public void method()																								//@<BlockInfo>jp.vstone.block.func,0,672,272,672,False,28,@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		date_string = CRobotUtil.getDateString();																		//@<BlockInfo>jp.vstone.block.freeproc,112,672,112,672,False,27,@</BlockInfo>
		time_string = CRobotUtil.getTimeString();

		String date0 = date_string;
		String time0 = time_string;


		String regex1 = "�N";
		String regex2 = "��";
		String regex3 = "��";
		String regex4 = "��";
		String regex5 = "��";
		String regex6 = "�b";
		String regex7 = "�j";

		String date1 = date_string.replaceAll(regex1, "/");
		String date2 = date1.replaceAll(regex2, "/");
		String date3 = date2.replaceAll(regex3, "");
		String date = date3.replaceAll(regex7, "");
		String time1 = time_string.replaceAll(regex4, ":");
		String time2 = time1.replaceAll(regex5, ":");
		String time = time2.replaceAll(regex6, "");

		String DateTime = date+time;
		String dt = DateTime.replaceAll("�@", "");


		String date_f1 = date_string.replaceAll(regex1, "_");
		String date_f2 = date_f1.replaceAll(regex2, "_");
		String date_f3 = date_f2.replaceAll(regex3, "");
		String date_f = date_f3.replaceAll(regex7, "");
		String time_f1 = time_string.replaceAll(regex4, "_");
		String time_f2 = time_f1.replaceAll(regex5, "_");
		String time_f = time_f2.replaceAll(regex6, "");

		String DateTime2 = date_f+time_f;
		String dt2 = DateTime2.replaceAll("�@", "");

		System.out.println(dt);
		System.out.println(dt2);

		/*String filepath = "/var/sota/photo/";
		filepath += (String)"picture03";
		boolean isTrakcing=GlobalVariable.robocam.isAliveFaceDetectTask();
		if(isTrakcing) GlobalVariable.robocam.StopFaceTraking();
		GlobalVariable.robocam.initStill(new CameraCapture(CameraCapture.CAP_IMAGE_SIZE_5Mpixel, CameraCapture.CAP_FORMAT_MJPG));
		GlobalVariable.robocam.StillPicture(filepath);
		CRobotUtil.Log("stillpicture","save picthre file to \"" + filepath +"\"");
		if(isTrakcing) GlobalVariable.robocam.StartFaceTraking();
		String path_in = "/var/sota/photo/picture03.jpg";
		String path_out = "/var/sota/photo/after_picture03.jpg";
		Mat mat_src = new Mat();
		mat_src = Imgcodecs.imread(path_in);
		Imgproc.putText(mat_src, date+" "+time, new Point(1900, 1900), Core.FONT_HERSHEY_SIMPLEX, 2.4f, new Scalar(0, 0, 0), 4);
		Imgcodecs.imwrite(path_out, mat_src);*/
																														//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void method1()																								//@<BlockInfo>jp.vstone.block.func,0,1168,832,1168,False,35,@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		date_string = CRobotUtil.getDateString();																		//@<BlockInfo>jp.vstone.block.freeproc,96,1168,96,1168,False,34,@</BlockInfo>
		time_string = CRobotUtil.getTimeString();

		String filepath = "/var/sota/photo/";
		filepath += (String)"picture";
		boolean isTrakcing=GlobalVariable.robocam.isAliveFaceDetectTask();
		if(isTrakcing) GlobalVariable.robocam.StopFaceTraking();
		GlobalVariable.robocam.initStill(new CameraCapture(CameraCapture.CAP_IMAGE_SIZE_5Mpixel, CameraCapture.CAP_FORMAT_MJPG));
		GlobalVariable.robocam.StillPicture(filepath);

		CRobotUtil.Log("stillpicture","save picthre file to \"" + filepath +"\"");
		if(isTrakcing) GlobalVariable.robocam.StartFaceTraking();
																														//@<EndOfBlock/>
		GlobalVariable.robocam.setEnableFaceSearch(true);																//@<BlockInfo>jp.vstone.block.facedetect.detect,160,1168,1184,1120,False,33,�猟�o@</BlockInfo>
		GlobalVariable.robocam.setEnableSmileDetect(true);
		GlobalVariable.robocam.setEnableAgeSexDetect(true);

		GlobalVariable.robocam.StartFaceDetect();
		try{
			GlobalVariable.detectCount=0;

																														//@<OutputChild>
			GlobalVariable.faceresult = GlobalVariable.robocam.getDetectResult();										//@<BlockInfo>jp.vstone.block.facedetect.isdetect,224,1120,912,1168,False,32,�R�����g@</BlockInfo>

			if(GlobalVariable.faceresult.isDetect()) GlobalVariable.detectCount++;
			else GlobalVariable.detectCount=0;

			if(GlobalVariable.detectCount>(int)3)
			{
																														//@<OutputChild>
				{																										//@<BlockInfo>jp.vstone.block.facedetect.gender2,288,1024,640,1024,False,31,@</BlockInfo>
					boolean isMale=false,isFemale=false;
					GlobalVariable.faceresult = GlobalVariable.robocam.getDetectResult();
					if(GlobalVariable.faceresult.isMale()!=null) isMale = GlobalVariable.faceresult.isMale();
					if(GlobalVariable.faceresult.isFemale()!=null) isFemale = GlobalVariable.faceresult.isFemale();

					if( isMale )
					{
																														//@<OutputChild>
					speechRecogResult = GlobalVariable.recog.getNamewithAbort((int)60000 , (int)3);						//@<BlockInfo>jp.vstone.block.talk.getname,352,976,576,976,False,30,�����F�����s���A���O���擾����B�擾���ʂ̓����o�[�ϐ���speechRecogResult�Ɋi�[�����B@</BlockInfo>

					if(speechRecogResult != null)
					{
																														//@<OutputChild>
																														//@</OutputChild>

					}else
					{
																														//@<OutputChild>
																														//@</OutputChild>

					}
																														//@<EndOfBlock/>
					GlobalVariable.faceresult = GlobalVariable.robocam.getDetectResult();								//@<BlockInfo>jp.vstone.block.facedetect.age.get2,448,976,448,976,False,29,���ݔF�����Ă����̔N�faceDetectResultAge�Ɋi�[�����B�炪�F������Ȃ��ꍇ�AfaceDetectResultAge��-1����������B@</BlockInfo>
					faceDetectResultAge = GlobalVariable.faceresult.getAge();											//@<EndOfBlock/>
																														//@</OutputChild>

					}else if( isFemale )
					{
																														//@<OutputChild>
																														//@</OutputChild>

					}else
					{
																														//@<OutputChild>
																														//@</OutputChild>

					}
				}
																														//@<EndOfBlock/>
																														//@</OutputChild>

			}else
			{
																														//@<OutputChild>
																														//@</OutputChild>

			}
																														//@<EndOfBlock/>
																														//@</OutputChild>

		}finally{
			GlobalVariable.robocam.StopFaceDetect();
		}
																														//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void photo_time()																							//@<BlockInfo>jp.vstone.block.func,16,816,176,816,False,36,@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		date_string = CRobotUtil.getDateString();																		//@<BlockInfo>jp.vstone.block.freeproc,96,816,96,816,False,37,@</BlockInfo>
		time_string = CRobotUtil.getTimeString();

		String date = date_string;
		String time = time_string;

		String date1 = date_string;
		String time1 = time_string;

		String[] regex = {"�N","��","���@","���@","��","�b","�j","��","��","��","��","��","�y"};

		for(int i = 0; i < 13; i++){
			if(i <= 1){
				date = date.replaceAll(regex[i], "/");
			}
			else if(i <= 3){
				time = time.replaceAll(regex[i], ":");
			}
			else{
				date = date.replaceAll(regex[i], "");
				time = time.replaceAll(regex[i], "");
			}

		}
		System.out.println(date);
		System.out.println(time);

		for(int j = 0; j < 13; j++){
			if(j <= 1){
				date1 = date1.replaceAll(regex[j], "_");
			}
			else if(j <= 3){
				time1 = time1.replaceAll(regex[j], "_");
			}
			else{
				date1 = date1.replaceAll(regex[j], "");
				time1 = time1.replaceAll(regex[j], "");
			}
		}
		System.out.println(date1);
		System.out.println(time1);

		String dt = date+" "+time;

		String dt2 = date1+"_"+time1;


		String filepath = "/var/sota/photo/";
		filepath += dt2;
		boolean isTrakcing=GlobalVariable.robocam.isAliveFaceDetectTask();

		GlobalVariable.sotawish.Say((String)"�ʐ^�B���",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);
		GlobalVariable.sotawish.Say((String)"�R�A�Q�A�P",MotionAsSotaWish.MOTION_TYPE_TALK,(int)3,(int)13,(int)11);

		if(isTrakcing) GlobalVariable.robocam.StopFaceTraking();
		GlobalVariable.robocam.initStill(new CameraCapture(CameraCapture.CAP_IMAGE_SIZE_5Mpixel, CameraCapture.CAP_FORMAT_MJPG));
		GlobalVariable.robocam.StillPicture(filepath);

		CRobotUtil.Log("stillpicture","save picthre file to \"" + filepath +"\"");
		if(isTrakcing) GlobalVariable.robocam.StartFaceTraking();

		String path_in = "/var/sota/photo/"+dt2+".jpg";
		String path_out = "/var/sota/photo/after_"+dt2+".jpg";

		Mat mat_src = new Mat();

		mat_src = Imgcodecs.imread(path_in);
		Imgproc.putText(mat_src, dt, new Point(1650, 1900), Core.FONT_HERSHEY_SIMPLEX, 2.4f, new Scalar(0, 0, 255), 4);

		Imgcodecs.imwrite(path_out, mat_src);
																														//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

}