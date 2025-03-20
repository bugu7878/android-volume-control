package com.example;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VolumeUtil.Init(getApplicationContext());

        // 点击按钮获取最大、最小、当前音量
        findViewById(R.id.CurrentMediaVolumeButton).setOnClickListener(view -> {
            int min = VolumeUtil.getMinMediaVolume();
            int max = VolumeUtil.getMaxMediaVolume();
            int current = VolumeUtil.getCurrentMediaVolume();
            ((TextView) findViewById(R.id.CurrentMediaVolumeText)).setText(String.format("min=%s, max=%s, current=%s", min, max, current));
        });
        findViewById(R.id.CurrentSystemVolumeButton).setOnClickListener(view -> {
            int min = VolumeUtil.getMinSystemVolume();
            int max = VolumeUtil.getMaxSystemVolume();
            int current = VolumeUtil.getCurrentSystemVolume();
            ((TextView) findViewById(R.id.CurrentSystemVolumeText)).setText(String.format("min=%s, max=%s, current=%s", min, max, current));
        });
        findViewById(R.id.CurrentRingVolumeButton).setOnClickListener(view -> {
            int min = VolumeUtil.getMinRingVolume();
            int max = VolumeUtil.getMaxRingVolume();
            int current = VolumeUtil.getCurrentRingVolume();
            ((TextView) findViewById(R.id.CurrentRingVolumeText)).setText(String.format("min=%s, max=%s, current=%s", min, max, current));
        });
        findViewById(R.id.CurrentNotificationVolumeButton).setOnClickListener(view -> {
            int min = VolumeUtil.getMinNotificationVolume();
            int max = VolumeUtil.getMaxNotificationVolume();
            int current = VolumeUtil.getCurrentNotificationVolume();
            ((TextView) findViewById(R.id.CurrentNotificationVolumeText)).setText(String.format("min=%s, max=%s, current=%s", min, max, current));
        });
        findViewById(R.id.CurrentAlarmVolumeButton).setOnClickListener(view -> {
            int min = VolumeUtil.getMinAlarmVolume();
            int max = VolumeUtil.getMaxAlarmVolume();
            int current = VolumeUtil.getCurrentAlarmVolume();
            ((TextView) findViewById(R.id.CurrentAlarmVolumeText)).setText(String.format("min=%s, max=%s, current=%s", min, max, current));
        });
        findViewById(R.id.CurrentCallVolumeButton).setOnClickListener(view -> {
            int min = VolumeUtil.getMinCallVolume();
            int max = VolumeUtil.getMaxCallVolume();
            int current = VolumeUtil.getCurrentCallVolume();
            ((TextView) findViewById(R.id.CurrentCallVolumeText)).setText(String.format("min=%s, max=%s, current=%s", min, max, current));
        });

        // 点击按钮修改当前音量
        findViewById(R.id.SetMediaVolumeButton).setOnClickListener(view -> {
            VolumeUtil.setMediaVolume(Integer.parseInt(((EditText) findViewById(R.id.SetMediaVolumeText)).getText().toString()));
        });
        findViewById(R.id.SetSystemVolumeButton).setOnClickListener(view -> {
            VolumeUtil.setSystemVolume(Integer.parseInt(((EditText) findViewById(R.id.SetSystemVolumeText)).getText().toString()));
        });
        findViewById(R.id.SetRingVolumeButton).setOnClickListener(view -> {
            VolumeUtil.setRingVolume(Integer.parseInt(((EditText) findViewById(R.id.SetRingVolumeText)).getText().toString()));
        });
        findViewById(R.id.SetNotificationVolumeButton).setOnClickListener(view -> {
            VolumeUtil.setNotificationVolume(Integer.parseInt(((EditText) findViewById(R.id.SetNotificationVolumeText)).getText().toString()));
        });
        findViewById(R.id.SetAlarmVolumeButton).setOnClickListener(view -> {
            VolumeUtil.setAlarmVolume(Integer.parseInt(((EditText) findViewById(R.id.SetAlarmVolumeText)).getText().toString()));
        });
        findViewById(R.id.SetCallVolumeButton).setOnClickListener(view -> {
            VolumeUtil.setCallVolume(Integer.parseInt(((EditText) findViewById(R.id.SetCallVolumeText)).getText().toString()));
        });
    }
}