import React, { useState } from 'react';

export default function App() {
	const questions = [
		{
			questionText: '1.Which of the following command is used to install create-react-app?',
			answerOptions: [
				{ answerText: 'install -g create-react-app', isCorrect: false },
				{ answerText: 'npm install -f create-react-app', isCorrect: false },
				{ answerText: 'npm install create-react-app', isCorrect: true },
				{ answerText: 'npm install -g create-react-app', isCorrect: false },
			],
		},
		{
			questionText: '2.Which of the following acts as the input of a class-based component?',
			answerOptions: [
				{ answerText: 'Class', isCorrect: false },
				{ answerText: 'Props', isCorrect: true },
				{ answerText: 'Render', isCorrect: false },
				{ answerText: 'Factory', isCorrect: false },
			],
		},
		{
			questionText: '3.What is the default port where webpack-server runs?',
			answerOptions: [
				{ answerText: '3000', isCorrect: false },
				{ answerText: '8080', isCorrect: true },
				{ answerText: '8003', isCorrect: false },
				{ answerText: '6000', isCorrect: false },
			],
		},
		{
			questionText: '4.What are the two ways to handle data in React?',
			answerOptions: [
				{ answerText: 'State & Props', isCorrect: true },
				{ answerText: 'State & Components', isCorrect: false },
				{ answerText: 'State & Services', isCorrect: false },
				{ answerText: 'State & Component', isCorrect: false },
			],
		},
		{
			questionText: '5.Which of the following method refers to the parent class in React.js?',
			answerOptions: [
				{ answerText: 'inherits()', isCorrect: false },
				{ answerText: 'self()', isCorrect: false },
				{ answerText: 'this()', isCorrect: false },
				{ answerText: 'super()', isCorrect: true },
			],
		},
	];

	const [currentQuestion, setCurrentQuestion] = useState(0);
	const [showScore, setShowScore] = useState(false);
	const [score, setScore] = useState(0);

	const handleAnswerOptionClick = (isCorrect) => {
		if (isCorrect) {
			setScore(score + 1);
		}

		const nextQuestion = currentQuestion + 1;
		if (nextQuestion < questions.length) {
			setCurrentQuestion(nextQuestion);
		} else {
			setShowScore(true);
		}
	};
	
	return (
		<body>
		<h1>React JS MCQ</h1>
		<div className='app'>
			{showScore ? (
				<div className='score-section'>
				You scored {score} out of {questions.length} 
			   <label>
				<p>Correct Answer is :</p>
				<p>1.npm install create-react-app</p>
				<p>2.Props</p>
				<p>3.8080</p>
				<p>4.State&Props</p>
				<p>5.super()</p>
				</label>
				<div className="row">
              <button onClick={() => alert('Succesfully Saved Your Score')}>
                Close
              </button>
              </div>
		  	</div>				
				) : (
				<>
					<div className='question-section'>
						<div className='question-count'>
							<span>Question {currentQuestion + 1}</span>/{questions.length}
						</div>
						<div className='question-text'>{questions[currentQuestion].questionText}</div>
					</div>
					<div className='answer-section'>
						{questions[currentQuestion].answerOptions.map((answerOption) => (
							<button onClick={() => handleAnswerOptionClick(answerOption.isCorrect)}>{answerOption.answerText}</button>
						))}
					</div>
				</>
			)}
		</div>
		</body>
	);
	
}