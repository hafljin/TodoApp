package com.example.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * Control + Option + I　でインテンド
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * タスクのリスト
         */
        //todo リスト化
        //todo 画面右下にはプラスボタン(押下でDialog表示)
        //todo 各タスクの右横に編集か削除か選択可能なアクション


        /**
         * Dialog
         */
        //todo タイトル TextField
        //todo カテゴリー プルダウン
        //todo メモ蘭 TextField (改行あり、スクロール可能)
        //todo 登録ボタン、キャンセルボタン
    }
}