package com.helloworld.gillani.xylophone;

import android.media.AudioManager;
import android.media.SoundPool;
import android.renderscript.RenderScript;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private final int NR_OF_SIMULTANEOUS_SOUND=7;
    private final float LEFT_VOL=1.0f;
    private final float RIGHT_VOL=1.0f;
    private final int NO_LOOP=0;
    private final int Priority=0;
    private final float NORMAL_PLAY_RATE=1.0f;

    //TODO:ADD member variables here
    private SoundPool mSoundPOOL;
    private  int mCSoundId;
    private  int mDSoundId;
    private  int mESoundId;
    private  int mFSoundId;
    private  int mGSoundId;
    private  int mASoundId;
    private  int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //TODO:create a new SOundpool

        mSoundPOOL =new SoundPool(NR_OF_SIMULTANEOUS_SOUND, AudioManager.STREAM_MUSIC,0);

        mCSoundId=mSoundPOOL.load(getApplicationContext(),R.raw.note1_c,1);
        mDSoundId=mSoundPOOL.load(getApplicationContext(),R.raw.note2_d,1);
        mESoundId=mSoundPOOL.load(getApplicationContext(),R.raw.note3_e,1);
        mFSoundId=mSoundPOOL.load(getApplicationContext(),R.raw.note4_f,1);
        mGSoundId=mSoundPOOL.load(getApplicationContext(),R.raw.note5_g,1);
        mASoundId=mSoundPOOL.load(getApplicationContext(),R.raw.note6_a,1);
        mBSoundId=mSoundPOOL.load(getApplicationContext(),R.raw.note7_b,1);


    }

    public void playC(View v){
        mSoundPOOL.play(mCSoundId,LEFT_VOL,RIGHT_VOL,Priority,NO_LOOP,NORMAL_PLAY_RATE);

        }

    public void playD(View v){

        mSoundPOOL.play(mDSoundId,LEFT_VOL,RIGHT_VOL,Priority,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playE(View v){
        mSoundPOOL.play(mESoundId,LEFT_VOL,RIGHT_VOL,Priority,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playF(View v){
        mSoundPOOL.play(mFSoundId,LEFT_VOL,RIGHT_VOL,Priority,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playG(View v){
        mSoundPOOL.play(mGSoundId,LEFT_VOL,RIGHT_VOL,Priority,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playA(View v){
        mSoundPOOL.play(mASoundId,LEFT_VOL,RIGHT_VOL,Priority,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playB(View v){
        mSoundPOOL.play(mBSoundId,LEFT_VOL,RIGHT_VOL,Priority,NO_LOOP,NORMAL_PLAY_RATE);

    }




}
