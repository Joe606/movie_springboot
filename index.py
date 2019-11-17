from flask import Flask,request,escape
app = Flask(__name__)

@app.route('/')
def hello():
    return 'Hello, World!'

@app.route('/a')
def hi():
    name = request.args.get('name','world')
    return f'hello,{escape(name)}!'

if __name__ == '__main__':
    app.run(host='0.0.0.0',port=5000)


